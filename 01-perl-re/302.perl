$lines = "";

while (<>) {
    $_ =~ s/\<[^\>]*\>//g;
    $_ =~ s/\<\/[^\>]*\>//g;
    $_ =~ s/^\s+//;
    $_ =~ s/\s+$//;
    $_ =~ s/\s+/\ /g;
    $lines .= $_ . "\n";
}

$lines =~ s/^\s+//;
$lines =~ s/\s+$//;
$lines =~ s/(^$(\n?))+/\n/gm;

print $lines;

