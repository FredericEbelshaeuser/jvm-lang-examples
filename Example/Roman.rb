
class Roman
  def self.method_missing(name, *args)
    roman = name.to_s
    (roman.count("I")+
    roman.count("V")*5+
    roman.count("X")*10+
    roman.count("L")*50+
    roman.count("C")*100+
    roman.count("M")*1000)
  end
end

puts Roman.XXVIII
puts Roman.XII
puts Roman.MMVIII
# who knows this date ;)