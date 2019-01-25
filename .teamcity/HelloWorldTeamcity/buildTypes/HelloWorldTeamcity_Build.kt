package HelloWorldTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object HelloWorldTeamcity_Build : BuildType({
    uuid = "416c4d17-a12e-4afc-be59-f6110208debf"
    name = "Build"

    vcs {
        root(HelloWorldTeamcity.vcsRoots.HelloWorldTeamcity_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCiRefsHeads)
    }

    triggers {
        vcs {
        }
    }
})
