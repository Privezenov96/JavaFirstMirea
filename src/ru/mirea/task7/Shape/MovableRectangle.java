package ru.mirea.task7.Shape;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "topLeft x: " + this.topLeft.x + ", topLeft y: " + this.topLeft.y + "bottomRight x: " + this.bottomRight.x + ", bottomRight y: " + this.bottomRight.y;
    }

    public boolean checkSpeed() {
        return this.topLeft.ySpeed == this.bottomRight.ySpeed & this.topLeft.xSpeed == this.bottomRight.xSpeed;
    }

    public void moveUp() {
        if (checkSpeed()) {
            this.topLeft.y -= this.topLeft.ySpeed; // если точка отсчёта находится в левом верхнем углу
            this.bottomRight.y -= this.bottomRight.ySpeed; // если точка отсчёта находится в левом верхнем углу
        }
    }

    public void moveDown() {
        if (checkSpeed()) {
            this.topLeft.y += this.topLeft.ySpeed;
            this.bottomRight.y += this.bottomRight.ySpeed;
        }
    }

    public void moveLeft() {
        if (checkSpeed()) {
            this.topLeft.x -= this.topLeft.xSpeed;
            this.bottomRight.x -= this.bottomRight.xSpeed;
        }
    }

    public void moveRight() {
        if (checkSpeed()) {
            this.topLeft.x += this.topLeft.xSpeed;
            this.bottomRight.x += this.bottomRight.xSpeed;
        }
    }
}