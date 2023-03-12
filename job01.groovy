job("testjob01") {
	description("Test Job for groovy")
	keepDependencies(false)
	scm {
		git {
			remote {
				github("tothger/groovytest", "ssh")
				credentials("ssh_with_passphrase_provided")
			}
			branch("*/master")
		}
	}
	disabled(false)
	triggers {
		scm("H/5 * * * *") {
			ignorePostCommitHooks(false)
		}
	}
	concurrentBuild(false)
	steps {
		shell("ls -all")
	}
}
