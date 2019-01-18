package HelloWorldTeamcity

import HelloWorldTeamcity.buildTypes.*
import HelloWorldTeamcity.vcsRoots.*
import HelloWorldTeamcity.vcsRoots.HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "a4ef8bb1-50ac-45c4-b58c-5b2935f03bba"
    id("HelloWorldTeamcity")
    parentId("_Root")
    name = "Hello World Teamcity"

    vcsRoot(HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster)

    buildType(HelloWorldTeamcity_TestBuild)

    features {
        feature {
            id = "PROJECT_EXT_6"
            type = "OAuthProvider"
            param("clientId", "92c25bcf67bc9f4f11bc")
            param("defaultTokenScope", "public_repo,repo,repo:status,write:repo_hook")
            param("secure:clientSecret", "credentialsJSON:0f8e7869-ec95-40c3-ba72-d62315c2c7d3")
            param("displayName", "helloworld teamcity")
            param("gitHubUrl", "https://github.com/")
            param("providerType", "GitHub")
        }
        versionedSettings {
            id = "PROJECT_EXT_7"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
