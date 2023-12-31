package com.github.872963588.womtemplate.generator

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import com.github.alvinscrp.androidcodetemplate.generator.mvvm.jlMvvmGenerator
import com.github.alvinscrp.androidcodetemplate.generator.util.AppType


class PluginGeneratorProvider : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(
        //这里建了三套模板
        jlMvvmGenerator(AppType.List),
        jlMvvmGenerator(AppType.Activity),
        jlMvvmGenerator(AppType.Fragment)
    )
}