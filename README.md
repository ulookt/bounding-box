This repo solves this task:

Fill a collection with several regular shapes (circle, regular triangle, square, regular hexagon).
Which shape has the greatest bounding box area?

A bounding box of a shape covers the shape completely, and its sides are parallel with the x or y
axis. Each shape can be represented by its center and side length (or radius), if we assume that
one side of the polygons are parallel with x axis, and its nodes lies on or above this side.
Load and create the shapes from a text file. The first line of the file contains the number of the
shapes, and each following line contain a shape. The first character will identify the type of the
shape, which is followed by the center coordinate and the side length or radius.
Manage the shapes uniformly, so derive them from the same super class.
