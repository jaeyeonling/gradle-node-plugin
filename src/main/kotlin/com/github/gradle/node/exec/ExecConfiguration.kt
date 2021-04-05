package com.github.gradle.node.exec

import org.gradle.api.Action
import org.gradle.process.ExecSpec
import java.io.File

internal data class ExecConfiguration(
        val executable: String,
        val args: List<String> = listOf(),
        val additionalBinPaths: List<String> = listOf(),
        val environment: Map<String, String> = mapOf(),
        val workingDir: File? = null,
        val execOverrides: Action<in ExecSpec>? = null
)
