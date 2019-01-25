package HelloWorldTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.dockerCommand
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.dockerCompose
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object HelloWorldTeamcity_Build : BuildType({
    uuid = "416c4d17-a12e-4afc-be59-f6110208debf"
    name = "Build"

    vcs {
        root(HelloWorldTeamcity.vcsRoots.HelloWorldTeamcity_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCiRefsHeads)
    }

    steps {
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
        dockerCompose {
            file = "docker-compose.yml"
        }
        dockerCommand {
            commandType = build {
                source = path {
                    path = "Dockerfile"
                }
            }
        }
        script {
            scriptContent = "./broker-list.sh"
        }
        script {
            scriptContent = "./create-topics.sh"
        }
        script {
            scriptContent = "./download-kafka.sh"
        }
        script {
            scriptContent = "./start-kafka-shell.sh"
        }
        script {
            scriptContent = "./start-kafka.sh"
        }
        script {
            scriptContent = "./versions.sh"
        }
    }

    triggers {
        vcs {
        }
    }
})
