package HelloWorldTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object HelloWorldTeamcity_BuildTest : BuildType({
    uuid = "cd6a3826-a73a-4440-a216-fae31dbe6438"
    name = "BuildTest"

    vcs {
        root(HelloWorldTeamcity.vcsRoots.HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster)
    }

    steps {
        maven {
            goals = "clean test"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
            mavenVersion = defaultProvidedVersion()
            jdkHome = "%env.JDK_18%"
        }
    }

    triggers {
        vcs {
        }
    }
})
