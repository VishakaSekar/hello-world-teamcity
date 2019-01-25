package HelloWorldTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object HelloWorldTeamcity_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCiRefsHeads : GitVcsRoot({
    uuid = "46746d87-1ce9-4696-bded-facaeb72d0ee"
    name = "https://github.com/VishakaSekar/kafka-monitoring-extension-ci#refs/heads/master"
    url = "https://github.com/VishakaSekar/kafka-monitoring-extension-ci"
    authMethod = password {
        userName = "VishakaSekar"
        password = "credentialsJSON:78342c0a-6fdf-422a-b3ee-8ab94b77b18d"
    }
})
