pipeline {
    agent any 
    stages {
    
        stage("Build") { 
            steps {
                echo("Build the project")
            }
        }
        
        stage("Run UT") { 
            steps {
               echo("Run unit tests") 
            }
        }
        
        stage("Deploy to dev") { 
            steps {
                echo("deploying to the dev env") 
            }
        }
        
        stage("Deploy to qa") { 
            steps {
                echo("deploying to the qa env") 
            }
        }
    }
}