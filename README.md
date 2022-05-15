# WPI 2019 Individual Project CS 3733: Double-Slided
### The goal of the eight puzzle is to slide tiles into the neighboring empty space until the goal state is achieved. 
![alt_text](DoubleSlidedApp/endGame.png?raw=true)

For this Double-Slided assignment, there are three changes.
- The eight tiles only depict the numbers 1, 2, 3, or 4. 
- The tiles are double-sided. The number on each double-sided tile adds up to 5. Thus when a tile has "1" on one side, it has "4" on the other. Each tile has a gray-side with its digit drawn in black and the opposite side is colored in black with its digit drawn in white
- When you slide a tile into the adjacent empty space (shown in yellow below) the tile flips as part of that move. 

When you start your application, the puzzle will be in an initial configuration. The goal state on the right has the numbers (in clockwise order) running from 1 to 4, followed by the numbers from 1 to 4. The colors are significant in that you have to have first the gray tiles with digits from 1 to 4 and then the black tiles with digits 1 to 4. Note that you can only flip a tile that is adjacent to the empty space, and tiles must be flipped -- they can't simply slide across. 

### Initial State
![alt_text](DoubleSlidedApp/initialState.png?raw=true)  

At any time, the user can quit the application or reset the puzzle to its initial configuration. The user can select a tile adjacent to the empty space to flip into the empty space. Naturally only valid moves should be allowed. When a tile is moved, it flips to show the reverse side of the tile, and the tile is placed in the new space.

As the player moves tiles, the total number of moves so far should be shown to the user.  Naturally, if the player resets the puzzle, the number of moves is reset to zero.

# To run locally on mac M1 - install oracle's Arm 64 DMG Installer jdk-17
https://download.oracle.com/java/17/latest/jdk-17_macos-aarch64_bin.dmg
then run ./run.sh

# To run on mac M1 docker - install XQuartz and set up X11 forwarding
https://gist.github.com/sorny/969fe55d85c9b0035b0109a31cbcb088
then run ./run_docker.sh


