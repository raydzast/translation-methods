while (<>) {
    s/\([^)]+\)/()/g;
    print;
}

