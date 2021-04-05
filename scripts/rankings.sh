#!/usr/bin/env bash

function get_ranking() {
    grep -r -F "$1" --include="*ochiai*.csv" . | sort | grep -o '[0-9]\+$' | head -n 6 | awk '{ printf "%d, ", $0; sum += $0 } BEGIN { printf "Before refinement: ["} END { printf "\b\b], "; print "Average: " sum / NR }'
    grep -r -F "$1" --include="*ochiai*.csv" . | sort | grep -o '[0-9]\+$' | tail -n 6 | awk '{ printf "%d, ", $0; sum += $0 } BEGIN { printf "After refinement: ["} END { printf "\b\b], "; print "Average: " sum / NR }'
}

LINE="if (i < csLast && j < searchLast || Character.isHighSurrogate(ch)) {"
echo code: \#1428, $LINE
get_ranking "$LINE"
echo
echo code: \#1602, $LINE
LINE="for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {"
get_ranking "$LINE"
echo
echo code: \#1824, $LINE
LINE="final int start = chars[0] == '-' || chars[0] == '+' ? 1 : 1;"
get_ranking "$LINE"

