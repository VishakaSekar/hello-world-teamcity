package HelloWorldTeamcity

import HelloWorldTeamcity.buildTypes.*
import HelloWorldTeamcity.vcsRoots.*
import HelloWorldTeamcity.vcsRoots.HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "4c71e117-27f0-4d8a-b969-9fa7852eab8e"
    id("HelloWorldTeamcity")
    parentId("_Root")
    name = "Hello World Teamcity"

    vcsRoot(HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster)

    buildType(HelloWorldTeamcity_BuildTest)

    features {
        versionedSettings {
            id = "PROJECT_EXT_8"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${HelloWorldTeamcity_HttpsGithubComVishakaSekarHelloWorldTeamcityRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
