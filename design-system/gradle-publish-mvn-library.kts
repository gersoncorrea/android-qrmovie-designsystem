apply plugin: 'maven-publish'

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"]) // Publicando a versão 'release'

                groupId = LIBRARY_GROUP     // Defina o groupId
                artifactId = LIBRARY_ARTIFACT_ID    // Defina o artifactId da biblioteca
                version = LIBRARY_VERSION           // Defina a versão da biblioteca
            }
        }

        repositories {
            maven {
                url = uri("$buildDir/repo")  // Publicando localmente para testes
            }
        }
    }
}