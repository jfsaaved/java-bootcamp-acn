package org.accenture.day02.worksheet.libgdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Align;
import com.github.tommyettinger.textra.Styles;
import com.github.tommyettinger.textra.TypingLabel;
import org.accenture.day02.worksheet.Day02Worksheet;

public class Day02ApplicationAdaptor extends ApplicationAdapter implements InputProcessor {
    SpriteBatch batch;
    BitmapFont font;
    TypingLabel label;
    TypingLabel label2;

    StringBuilder inputBuffer = new StringBuilder();
    int enteredNumber = 0;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont(); // Use a nicer font in production
        font.getData().setScale(2f);

        label = newLabel01("{SLOWER}Type a number.", new Styles.LabelStyle(font, Color.WHITE));
        label2 = newLabel02("Waiting for input...",new Styles.LabelStyle(font, Color.LIGHT_GRAY));

        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render() {
        label.act(Gdx.graphics.getDeltaTime());
        label2.act(Gdx.graphics.getDeltaTime());

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        label.draw(batch, 1f);
        label2.draw(batch, 1f);
        batch.end();
    }

    @Override
    public boolean keyTyped(char character) {
        if (character >= '0' && character <= '9') {
            inputBuffer.append(character);
            label = newLabel01(inputBuffer.toString(), new Styles.LabelStyle(font, Color.WHITE));
        } else if (character == '\r' || character == '\n') { // Enter key
            if (inputBuffer.length() > 0) {
                try {
                    enteredNumber = Integer.parseInt(inputBuffer.toString());
                    System.out.println("Entered number: " + enteredNumber);
                    label = newLabel01("Type a number.", new Styles.LabelStyle(font, Color.WHITE));
                    label2 = newLabel02(Day02Worksheet.fizzBuzz(enteredNumber),new Styles.LabelStyle(font, Color.LIGHT_GRAY));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number input.");
                }
                inputBuffer.setLength(0); // Clear buffer
            }
        }
        return true;
    }
    private TypingLabel newLabel01(String text, Styles.LabelStyle style) {
        TypingLabel label = new TypingLabel(text, style);
        label.setWidth(400); // optional: word wrapping
        label.setAlignment(Align.center);

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float labelHeight = label.getPrefHeight();

        label.setPosition((screenWidth - label.getWidth()) / 2f, (screenHeight + labelHeight) / 2f);
        return label;
    }

    private TypingLabel newLabel02(String text, Styles.LabelStyle style) {
        TypingLabel label2 = new TypingLabel(text, style);
        label2.setWidth(400);
        label2.setAlignment(Align.center);

        float screenWidth = Gdx.graphics.getWidth();

        float spacing = 40f;
        label2.setPosition((screenWidth - label2.getWidth()) / 2f,
                label.getY() - label2.getPrefHeight() - spacing);

        return label2;
    }
    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
    }

    @Override public boolean keyDown(int keycode) { return false; }
    @Override public boolean keyUp(int keycode) { return false; }
    @Override public boolean touchDown(int x, int y, int pointer, int button) { return false; }
    @Override public boolean touchUp(int x, int y, int pointer, int button) { return false; }
    @Override public boolean touchDragged(int x, int y, int pointer) { return false; }
    @Override public boolean mouseMoved(int x, int y) { return false; }
    @Override public boolean scrolled(float amountX, float amountY) { return false; }
}