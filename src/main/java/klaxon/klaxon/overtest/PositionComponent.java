package klaxon.klaxon.overtest;

import com.overminddl1.over_ecs.Component;

public class PositionComponent implements Component {

    public double x;
    public double y;
    public double z;

    public PositionComponent() {

        this.componentReset();
    }

    public PositionComponent(double x, double y, double z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Component componentClone() {
        return new PositionComponent(x, y, z);
    }

    @Override
    public void componentReset() {

        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
}
