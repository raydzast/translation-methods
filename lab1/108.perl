while (<>) {
    print if /\([^()]*\w+[^()]*\)/
}
