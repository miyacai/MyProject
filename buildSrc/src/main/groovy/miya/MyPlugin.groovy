package miya

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project>{

	  @Override  
    void apply(Project project) {  
		project.task('cucumber_integration') << {
			println "Current time is !!!"
		
//        project.logger.info "Configuring Project Structure for $project.name"  
//  
//        project.configurations {  
//            integrationTestCompile { extendsFrom testCompile }  
//            integrationTestRuntime { extendsFrom integrationTestCompile, testRuntime }  
//        }  
//        configureSourceSets(project)  
//        addIntegrationTestTask(project)  
    }  
//  
//    private void addIntegrationTestTask(Project project) {  
//        Test intgTest = project.getTasks().create("integrationTest", Test.class);  
//        intgTest.testClassesDir = project.sourceSets.integrationTest.output.classesDir  
//        intgTest.includes = ["**/*IntegrationTest.class"]  
//        intgTest.inputs.dir 'src'  
//        intgTest.outputs.dir project.sourceSets.integrationTest.output.classesDir  
//        project.check.dependsOn project.integrationTest  
//		
//		
//		dependsOn assemble, compileIntegrationJava,processIntegrationResources
//		doLast {
//			javaexec {
//				main = "cucumber.api.cli.Main"
//				classpath = project.configurations.integrationTestRuntime + sourceSets.main.output + sourceSets.integration.output
//				args = ['--plugin', 'pretty','--tags','@B2_9463','--snippets','camelcase', '--glue', 'com.blackboard.mbaas.rest.service', 'src/integration/resources']
//			}
//		}
//    }  
//  
//    private void configureSourceSets(Project project) {  
//        project.sourceSets {  
//            integration {  
//                java {  
//                    srcDir 'src/integration/java'  
//                }  
//				resources { 
//					  srcDir 'src/integration/resources'   
//				}
//				compileClasspath += sourceSets.main.runtimeClasspath + sourceSets.test.runtimeClasspath
//				runtimeClasspath += sourceSets.main.runtimeClasspath + sourceSets.test.runtimeClasspath
//			}
//		}
    }  
}
