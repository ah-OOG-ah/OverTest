package klaxon.klaxon.overtest;

import com.overminddl1.over_ecs.Entity;
import com.overminddl1.over_ecs.World;
import com.overminddl1.over_ecs.bundles.BundleN;
import com.overminddl1.over_ecs.query.QueryState;
import com.overminddl1.over_ecs.query.WorldQuery;

import java.util.ArrayList;

import static klaxon.klaxon.overtest.EntityBundle.entityBundle;

/**
 * Goals:
 * Spawn 100 entities
 * Make em dance!
 */
public class Main {

    private static final World world = new World();
    static ArrayList<EntityBundle> init;
    static final int count = 100;
    static Entity[] entities = new Entity[count];

    public static void main(String[] args) {

        System.out.println("Hello world!");

        BundleN bundle = new BundleN(new PositionComponent(), new VelocityComponent());

        for (int i = 0; i < count; ++i) {


            entities[i] = world.spawn();
            entities[i].insert_bundle(bundle.set_unchecked(0, new PositionComponent()).set_unchecked(1, new VelocityComponent()));
        }

        // Query all vel+pos
        QueryState q = world.query(WorldQuery.builder().read_component(PositionComponent.class));

        //q.for_each(System.out::println);
    }
}