package HelloWorldTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object HelloWorldTeamcity_TestBuild : BuildType({
    uuid = "b52c2fe6-5dce-4238-8125-57da9029263a"
    name = "TestBuild"

    vcs {
        root(HelloWorldTeamcity.vcsRoots.HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster)
    }

    triggers {
        vcs {
        }
    }
})
