#!/usr/bin/perl
use warnings;
use strict;

use HTTP::Server::Simple;

my $server = HTTP::Server::Simple->new();
$server -> run();
