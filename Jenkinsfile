node {
    ws("D:/Projects/Latihan/openshift/test") {
        stage('Build') {
			withMaven {
				bat "mvn clean package"
			}
		}
    }
}