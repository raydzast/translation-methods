while (<>) {
    s/\([^)]+\)/()/g;
    print;
}
