# Software Engineering Project

It's my huge honor to work with some amazing guys in this project!

## Interface
[User Manual](https://docs.google.com/document/d/1JE3fOi-wDLmoxJkHFv0VrS4U5Ac7JAF_5eupDwSHs7A/edit?usp=sharing)

[YouTube](https://youtu.be/-rbFr2o-8pE)

## Design

### Design is aimed for high cohesion within module and low coupling between modules.
* MVC architecture:
* Model: The chess board, chess rules, all the pieces. Under [model](src/main/java/model) directory.
* View: The chess board UI and window. Under [view](src/main/java/view) directory.
* Controller: Bridges between model and view. Implemented under [controller](src/main/java/controller) directory.


### OOP design patterns:
* Factory pattern: To construct chess pieces from their representations. Implementation is in [BoardBuilder.java](src/main/java/utils/BoardBuilder.java).

## Build and Run

* This is a Maven project, and you may refer to our [Developer Manual](https://docs.google.com/document/d/1fM7ZjxvtYArSgI7EAWV1td9gPPMDGmlRZC2ef2OQqDU/edit)  



