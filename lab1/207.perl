while (<>) {
    s/([a-z])\1*/\1/g;
    print;
}

