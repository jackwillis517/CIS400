public class Coord {
    public int x;
    public int y;
    public Coord(int i, int j) {
        this.x = i;
        this.y = j;
    }
    @Override
    public String toString() {
        return  new StringBuilder().append("(").append(x).append(", ").append(y).append(")").toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Coord that = (Coord) o;
        if (x != that.x || y != that.y) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(this.x * 31) + Integer.hashCode(this.y);
    }
}
