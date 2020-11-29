node {
    stage('Build') {
		ws("D:/Projects/Latihan/openshift/test") {
			withMaven {
				bat "mvn clean package"
			}
		}
    }
}