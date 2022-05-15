#open -a XQuartz
xhost +
ip=$(ifconfig en0 | grep inet | awk '$1=="inet" {print $2}')
#docker run -v /tmp/.X11-unix:/tmp/.X11-unix -v ~/.Xauthority:/root/.Xauthority -e DISPLAY=$(ipconfig getifaddr en0):0 --rm doubleslidedapp
docker run -v /tmp/.X11-unix:/tmp/.X11-unix -e DISPLAY=$ip:0 --rm doubleslidedapp
