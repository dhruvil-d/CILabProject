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



