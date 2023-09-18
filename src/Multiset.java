public interface Multiset {
    Multiset add(int x);

    public Multiset remove(int x);

    public Multiset contains(int x);

    public Multiset is_empty();

    public Multiset count(int x);

    public Multiset size();
}
