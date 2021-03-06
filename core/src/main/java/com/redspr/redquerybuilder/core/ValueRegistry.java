package com.redspr.redquerybuilder.core;

import java.util.ArrayList;
import java.util.List;

public class ValueRegistry {
    public class Y {
        private Object value;

        public int getIndex() {
            return vals.indexOf(this);
        }

        public void setValue(Object p) {
            value = p;
        }

        public Object getValue() {
            return value;
        }
    }

    public void add(Y x) {
        if (!vals.contains(x)) {
            vals.add(x);
        }
    }

    public void remove(Y x) {
        vals.remove(x);
    }

    private final List<Y> vals = new ArrayList<Y>();

    public void add(Object a) {
        Y y = new Y();
        y.setValue(a);
        vals.add(y);
    }

    public Y getY(int i) {
        while (vals.size() <= i) {
            vals.add(new Y());
        }
        return vals.get(i);
    }

    public Y getY() {
        Y x = new Y();
        vals.add(x);
        return x;
    }
}
