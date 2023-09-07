package klaxon.klaxon.overtest;

import com.overminddl1.over_ecs.bundles.BundleN;

import javax.swing.text.html.parser.Entity;

public class EntityBundle extends BundleN {

    private static final EntityBundle entityBundle = new EntityBundle(new PositionComponent(), new VelocityComponent());

    public EntityBundle(PositionComponent pos, VelocityComponent vel) {
        super(pos, vel);
    }

    public static BundleN entityBundle() {
        return entityBundle.set_unchecked(0, new PositionComponent()).set_unchecked(1, new VelocityComponent());
    }
}
