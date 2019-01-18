package HelloWorldTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster : GitVcsRoot({
    uuid = "3ba43e51-7068-443f-9eab-57c886f5794f"
    name = "https://github.com/VishakaSekar/hello-world-teamcity#refs/heads/master"
    url = "https://github.com/VishakaSekar/hello-world-teamcity"
    authMethod = password {
        userName = "VishakaSekar"
        password = "credentialsJSON:78342c0a-6fdf-422a-b3ee-8ab94b77b18d"
    }
})
