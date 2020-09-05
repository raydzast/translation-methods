sub uniq {
  my %seen;
  return grep { !$seen{$_}++ } @_;
}

my $data = do { local $/; <> };

my $href = qr/(<a[^\n>]+\bhref="([^"\n]*)"[^\n>]*>)/;

$data =~ s/$href/\n\n\1\n\n/g;
$data =~ s/$href|(.*)/\1/gm;
$data =~ s/(^$)(\n)//gm;
$data =~ s/$href/\2/g;

my @links = split /\n/, $data;
my @correc = ( );

my $authority = qr/^(((([-A-Z._a-z0-9]|~)|%[0-9A-Fa-f][0-9A-Fa-f]|(\!|\$|&|'|\(|\)|\*|\+|,|;|\=)|\:)*)@)?((\[((([0-9A-Fa-f]{1,4}\:){6}(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|\:\:([0-9A-Fa-f]{1,4}\:){5}(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|([0-9A-Fa-f]{1,4})?\:\:([0-9A-Fa-f]{1,4}\:){4}(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|(([0-9A-Fa-f]{1,4}\:){0,1}[0-9A-Fa-f]{1,4})?\:\:([0-9A-Fa-f]{1,4}\:){3}(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|(([0-9A-Fa-f]{1,4}\:){0,2}[0-9A-Fa-f]{1,4})?\:\:([0-9A-Fa-f]{1,4}\:){2}(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|(([0-9A-Fa-f]{1,4}\:){0,3}[0-9A-Fa-f]{1,4})?\:\:[0-9A-Fa-f]{1,4}\:(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|(([0-9A-Fa-f]{1,4}\:){0,4}[0-9A-Fa-f]{1,4})?\:\:(([0-9A-Fa-f]{1,4}\:[0-9A-Fa-f]{1,4})|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]))|(([0-9A-Fa-f]{1,4}\:){0,5}[0-9A-Fa-f]{1,4})?\:\:[0-9A-Fa-f]{1,4}|(([0-9A-Fa-f]{1,4}\:){0,6}[0-9A-Fa-f]{1,4})?\:\:)|([Vv][0-9A-Fa-f]+\.(([-A-Z._a-z0-9]|~)|(\!|\$|&|'|\(|\)|\*|\+|,|;|\=)|\:)+))\])|([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])|((([-A-Z._a-z0-9]|~)|%[0-9A-Fa-f][0-9A-Fa-f]|(\!|\$|&|'|\(|\)|\*|\+|,|;|\=))*))(\:[0-9]*)?$/;

foreach (@links) {
  if (m/$authority/) {
    $_ =~ s/$authority/\6/;
  }
  else {
    $_ =~ s/^(([^:\/?#]+):)?(\/\/([^\/?#]*))?([^?#]*)(\?([^#]*))?(#(.*))?$/\4/;
    $_ =~ s/$authority/\6/;
  }

  if (m/^.+$/) {
    push @correc, $_;
  }
}

@correc = uniq @correc;
@correc = sort @correc;

foreach (@correc) {
  print $_ . "\n";
}
