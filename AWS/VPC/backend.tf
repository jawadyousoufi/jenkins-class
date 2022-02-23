terraform {
  backend "s3" {
    bucket = "pushbutton-jawad"
    key    = "us/app/pushbutton/vpc"
    region = "us-east-1"
  }
}