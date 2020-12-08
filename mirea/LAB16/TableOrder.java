package LAB16;

import PR16.Item;

public class TableOrder implements Order {
    private Customer customer;
    private int size;
    private MenuItem[] items = new MenuItem[20];

    @Override
    public boolean add(MenuItem item) {
        if (items.length == size) {
            MenuItem[] temp = new MenuItem[size + 2];
            System.arraycopy(items, 0, temp, 0, temp.length);
            items = temp;
        }
        try {
            items[size] = item;
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[items.length];
        for (int i = 0; i < items.length; i++)
            names[i] = items[i].getName();
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int quantity = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        return itemQuantity(itemName.getName());
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(itemName)) {
                if (i == size) {
                    items[i] = null;
                } else {
                    items[i] = items[size];
                    items[size] = null;
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        return remove(item.getName());
    }

    @Override
    public int removeAll(String itemName) {
        while (true) {
            if (!remove(itemName)) {
                break;
            }
        }
        return 0;
    }

    @Override
    public int removeAll(MenuItem item) {
        return removeAll(item.getName());
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        for (int i = items.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (items[j] != null && items[j + 1] != null) {
                    if (items[j].getCost() > items[j + 1].getCost()) {
                        MenuItem tmp = items[j];
                        items[j] = items[j + 1];
                        items[j + 1] = tmp;
                    }
                }
            }
        }
        return items;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for (MenuItem item : items) {
            if (item != null)
                total += item.getCost();
        }
        return total;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
