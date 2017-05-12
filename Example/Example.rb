
def gaussify(a,r)
  r.inject(a) do |sum, i|
    sum + i
  end
end

puts gaussify(0, 0..100)
puts gaussify("", "a".."z")


def gaussify2()
  sum=0
  for i in 0..100
    sum += i;
  end
  sum
end

puts gaussify2()

