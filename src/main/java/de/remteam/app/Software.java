package de.remteam.app;

import java.util.Objects;

public class Software implements  Product{

        private final String name;
        private final int id;

        public Software(String name, int id) {
            this.name = name;
            this.id = id;
        }


        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            de.remteam.app.Product product = (de.remteam.app.Product) o;
            return id == product.id && Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
