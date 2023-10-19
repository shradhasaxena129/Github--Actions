# Deployment on Google Kubernetes Engine




### Getting Started
1. Establishing a Google Cloud project
   involves either initiating a new project or making use of an existing one.


2. Configuring Secrets
   In your GitHub repository, go to Settings > Secrets and add the following secrets:


* PROJECT_ID: Google Cloud Project ID
* GKE_CLUSTER: GKE Cluster Name
* GKE_ZONE: GKE Cluster Zone
* GCLOUD_AUTH: Google Cloud service account JSON key with necessary permissions
* GITHUB_USERNAME: Your GitHub username
* GITHUB_PASSWORD: Your GitHub password (or Personal Access Token)


3. Deploy Application
* Commit your changes to the repository.




GitHub Actions will autonomously initiate the CI/CD pipeline when commits are pushed to the designated branch.


* Build the Spring Boot application using Maven.
* Build a Docker image of the application and push it to GitHub Container Registry (ghcr.io).
* Deploy the application to the specified GKE cluster.


4. To access the application, navigate to:


> http://<GKE_LoadBalancer_IP>/pipeline

