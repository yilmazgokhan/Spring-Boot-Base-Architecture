IMAGE_NAME:=spring-boot-base
IMAGE_TAG:=latest

# This command will run the project in docker environment. The project will execute on port 8080 on your computer.
default:
	mvn clean install -DskipTests
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .
	docker run -p 8080:8080 $(IMAGE_NAME):$(IMAGE_TAG)

clean:
	mvn clean

image:
	docker build -t $(IMAGE_NAME):$(IMAGE_TAG) .

run:
	docker run -p 8080:8080 $(IMAGE_NAME):$(IMAGE_TAG)

run-background:
	docker run -d -p 8080:8080 $(IMAGE_NAME):$(IMAGE_TAG)

run-bash:
	docker run -i -t $(IMAGE_NAME):$(IMAGE_TAG) /bin/bash
