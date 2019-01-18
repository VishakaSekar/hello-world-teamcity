package HelloWorldTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster : GitVcsRoot({
    uuid = "041fe580-2b7e-48c4-8f75-2ccefa7fddba"
    name = "https://github.com/VishakaSekar/hello-world-teamcity#refs/heads/master"
    url = "https://github.com/VishakaSekar/hello-world-teamcity"
    authMethod = password {
        userName = "VishakaSekar"
        password = "credentialsJSON:d6e3f134-5e92-449f-a971-6db9d6a22b66"
    }
})
