docker stop agilecontainer
docker rm -f agilecontainer
docker rmi agileimage
call mvn verify
docker build -f Dockerfile --platform linux/amd64 -t agileimage:0.1 DockerfileDev
docker run --name agilecontainer -p 8080:8080 -d agileimage:0.1