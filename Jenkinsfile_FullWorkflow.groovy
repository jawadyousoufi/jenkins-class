node {
	stage("Build VPC"){
        build 'VPCDeployer'
	}
	stage("Build RDS"){
		build 'RDSDeployer'
	}
	stage("Build AMI"){
		build 'Packer Builder'
	}
    stage("Build Instance"){
		build 'EC2Deployer3'

	stage("Send Notification"){
			echo "Hello"
    }
}