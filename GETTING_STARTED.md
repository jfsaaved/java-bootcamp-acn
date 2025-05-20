# Getting Started (Windows) – Java Bootcamp Environment Setup

This guide will help you set up your development environment for Windows. For macOS / Linux there are just minor tweaks, please contact with contributor if help is needed.

---
## Requirements

You will need to install the following:
- Java Development Kit (JDK 8 or higher)
	- The JDK is the **toolbox** in order to write, compile, and run Java programs
- IntelliJ IDEA (other IDE is fine, demo is done through IntelliJ IDEA)
	- An IDE is a **workspace** for writing, running, debugging programs
- Git / GitHub Desktop
	- A **version control system** to help keep track of code and collaborate with others
- Optional: [Chocolatey](https://chocolatey.org/install)
	- **Package manager** for windows to help install software quickly from the command line

---
## Install Java (JDK 8 or higher)

### Option 1: Install JDK **manually**

1. Go to: https://www.oracle.com/java/technologies/javase/javase8-archive-downloads.html
2. Download **JDK 8** for your OS (e.g., Windows x64 `.exe`)
3. Run the installer
4. After installation, set your environment variable:
   - Open *System Properties → Environment Variables*
   - Under **System Variables**, find or create:
     - `JAVA_HOME` → `C:\Program Files\Java\jdk1.8.0_xx`
     - Add `%JAVA_HOME%\bin` to `Path`

5. Verify:
   ```bash
   java -version
   ```

---
### Option 2: Install JDK 8 via **Chocolatey** (Recommended for Windows)

1. Open **PowerShell as Administrator**
2. Run the following:
   ```powershell
   choco install jdk8 -y
   ```

3. Verify:
   ```powershell
   java -version
   ```

---
## Install IntelliJ IDEA (Community Edition)

1. Download from: https://www.jetbrains.com/idea/download/
2. Install the **Community Edition**
3. When you run it for the first time:
   - Install the **Java** plugin (if not already installed)
   - Optionally install the **Git** plugin

---
## Install Git

### Manual:
- Download from: https://git-scm.com/downloads
- Follow the installer instructions
### With Chocolatey:
```powershell
choco install git -y
```

Verify:
```bash
git --version
```

## Install GitHub Desktop (Alternative)

1. Download from: https://desktop.github.com/download/
2. Follow the installer instructions

---
## Verify All Tools

```bash
java -version        # Should print 1.8.x
javac -version       # Java compiler
git --version        # Should print git version
```

You’re now ready to clone the bootcamp repo and start coding!

---
## Cloning the Bootcamp Repository

```bash
git clone https://github.com/jfsaaved/java-bootcamp-acn.git
```

## Alternatively

You can login to GitHub Desktop and clone:

![Pasted image 20250519144738.png](Pasted%20image%2020250519144738.png)

Then enter https://github.com/jfsaaved/java-bootcamp-acn.git under the "Repository URL or GitHub username and repository" section then click 'Clone' button.

![Pasted image 20250519144828.png](Pasted%20image%2020250519144828.png)

---
## Next Steps

- Open the project in your IDE
- Familiarize yourself with the IDE
- Look for the `week-01-introduction-to-coding` folder to get started!

---