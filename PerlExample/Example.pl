print "Hello World!\n";

sub gaussify1 {

	my $sum = 0;
	for ( $i = 0 ; $i <= 100 ; $i++ ) {
		$sum += $i;
	}
	return $sum;
}

print gaussify1();
print "\n";

sub gaussify2 {

	for ( $i = $_[0] ; $i <= $_[1] ; $i++ ) {
		$sum += $i;
	}
	return $sum;
}

print gaussify2( 0, 100 )
