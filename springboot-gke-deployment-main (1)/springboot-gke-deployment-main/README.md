# Spring Boot Application Deployment on Google Kubernetes Engine (GKE)

### Prerequisites
* GitHub account
* Google Cloud account


### Getting Started
1. Set Up Google Cloud Project
   Create a new Google Cloud Project or use an existing one.
2. Configure Secrets
   In your GitHub repository, go to Settings > Secrets and add the following secrets:

* PROJECT_ID: Google Cloud Project ID
* GKE_CLUSTER: GKE Cluster Name
* GKE_ZONE: GKE Cluster Zone
* GCLOUD_AUTH: Google Cloud service account JSON key with necessary permissions
* GITHUB_USERNAME: Your GitHub username
* GITHUB_PASSWORD: Your GitHub password (or Personal Access Token)

3. Deploy Application
* Commit your changes to the repository.

GitHub Actions will automatically trigger the CI/CD pipeline on pushes to the specified branch. The pipeline will:

* Build the Spring Boot application using Maven.
* Build a Docker image of the application and push it to GitHub Container Registry (ghcr.io).
* Deploy the application to the specified GKE cluster.

4. To access the application, navigate to:

> http://<GKE_LoadBalancer_IP>/hello
