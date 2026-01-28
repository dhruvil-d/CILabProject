\# CI Lab Project



This repository contains the implementation of a Jenkins-based Continuous Integration (CI) setup as part of the CI Lab assignment.



\## Implemented Jenkins Jobs



\### 1. Freestyle Project

\- Connected to a public GitHub repository

\- Poll SCM trigger configured to run every 5 minutes

\- GitHub webhook trigger enabled

\- Build steps include:

&nbsp; - Windows batch command execution

&nbsp; - Python script execution

\- Post-build actions:

&nbsp; - Artifact archiving

&nbsp; - Email notification on build status



\### 2. Multibranch Pipeline

\- Multibranch pipeline job configured in Jenkins

\- Automatically discovers all branches in the repository

\- Uses a Jenkinsfile stored in the repository root

\- Branch-based pipeline behavior:

&nbsp; - `main` branch: full build and test execution

&nbsp; - `feature/\*` branches: test execution only

&nbsp; - `release/\*` branches: test execution with simulated security scan



\## Repository Structure



CILabProject/

├── scripts/

│ ├── build.bat

│ └── test.py

├── Jenkinsfile

└── README.md





\## How to Use



1\. Open Jenkins and create the required jobs (Freestyle and Multibranch Pipeline).

2\. Configure SCM to point to this repository.

3\. Trigger builds manually or via SCM changes.

4\. Monitor build status and console output from Jenkins dashboard.



\## Tools Used

\- Jenkins (LTS)

\- Git \& GitHub

\- Java 17

\- Python 3


## Installation Guide

### Prerequisites
- Java JDK 11 or later (Java 17 used)
- Jenkins LTS
- Git for Windows
- Python 3

### Steps
1. Install Java and set `JAVA_HOME`.
2. Download and install Jenkins LTS for Windows.
3. Complete Jenkins initial setup wizard.
4. Install recommended plugins.
5. Configure Global Tool Configuration (JDK, Git, Maven).
6. Configure SMTP for email notifications.
7. Create Jenkins jobs (Freestyle and Multibranch Pipeline).
8. Connect Jenkins to this GitHub repository.

## User Manual

### Freestyle Job Usage
1. Open Jenkins Dashboard.
2. Select the Freestyle job.
3. Click **Build Now**.
4. View console output and archived artifacts.
5. Check email notifications for build status.

### Multibranch Pipeline Usage
1. Open Multibranch Pipeline job.
2. Jenkins automatically detects branches.
3. Select a branch (e.g., main).
4. Click **Build Now**.
5. Monitor pipeline stages and logs.

## Troubleshooting Guide

### Jenkins does not start
- Ensure Java is correctly installed.
- Verify `JAVA_HOME` environment variable.

### Git repository not cloning
- Check repository URL.
- Ensure repository is public or credentials are configured.

### Email notifications not received
- Verify SMTP configuration.
- Use Gmail App Password.
- Check spam folder.

### Pipeline fails
- Review console output.
- Verify Jenkinsfile syntax.
