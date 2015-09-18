package iad1.hashtable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Hashtable;

import static org.junit.Assert.*;

public class HashTableTest {

    private MathijsHashTable<String, String> ht;

    @Before
    public void setUp() throws Exception {
        ht = new MathijsHashTable<String, String>();
    }

    @Test
    public void testPuttingAndGettingKeys() {
        ht.put("naam", "Mathijs");
        ht.put("specialisatie", "software engineering");

        assertEquals("Mathijs", ht.get("naam"));
        assertEquals("software engineering", ht.get("specialisatie"));
    }

    class BadObject<T> {
        public final T value;

        BadObject(T value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof BadObject) {
                return ((BadObject) obj).value.equals(this.value);
            }
            return super.equals(obj);
        }

        @Override
        public int hashCode() {
            return 42;
        }
    }


    @Test
    public void testGettingACollidingNonExistentValueReturnsNull() {
        HashTable<BadObject<String>, String> ht = new MathijsHashTable<>();
        BadObject<String> naamObj = new BadObject<>("naam");
        ht.put(naamObj, "mathijs");
        ht.put(new BadObject<>("specialisatie"), "software engineering");

        assertNull(ht.get(new BadObject<String>("nonexistent")));
        assertEquals("mathijs", ht.get(naamObj));
    }

    @After
    public void tearDown() throws Exception {
        ht = null;
    }
}