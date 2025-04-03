/* Java uses automatic garbage collection to remove unused objects.
    No need for delete objects like in C++.
    The finalize() method in Java is a method of the Object class used to perform cleanup activity before destroying any object.
    Garbage collector calls finalize() method before destroying the objects from memory.
*/
package org.java101.Memory_Management_And_Garbage_Collection;

class MemoryMgt_CarbageCollection {
    protected void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        MemoryMgt_CarbageCollection g1 = new MemoryMgt_CarbageCollection();
        MemoryMgt_CarbageCollection g2 = new MemoryMgt_CarbageCollection();

        g1 = null;
        g2 = null;

        System.gc(); // Requesting JVM for garbage collection
    }
}
