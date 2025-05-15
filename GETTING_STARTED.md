# Getting Started – Java Bootcamp Environment Setup

This guide will help you set up your development environment.

---
## Requirements

You will need to install the following:
- Java Development Kit (JDK 8 or higher)
- IntelliJ IDEA (other IDE is fine, demo is done through IntelliJ IDEA)
- Git / GitHub Desktop
- Optional: [Chocolatey](https://chocolatey.org/install) (Windows package manager)

---
## Boot Camp OS

- Windows (Primary)
- Mac/Linux (with minor tweaks)

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
cd java-bootcamp-2025
```

---
## Next Steps

- Open the folder in IntelliJ
- Import as a **Gradle/Maven project** if applicable
- Look for the `week-01-introduction-to-coding` folder to get started!

---