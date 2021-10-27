inplace_edit 'Assignment01ruby.txt', '.bak' do |line|
  line = line.gsub(/aa/,"0")
  line = line.gsub(/ac/,"0")
  line = line.gsub(/ag/,"0")
  line = line.gsub(/at/,"0")
  line = line.gsub(/ca/,"0")
  line = line.gsub(/cc/,"0")
  line = line.gsub(/cg/,"0")
  line = line.gsub(/ct/,"0")
  line = line.gsub(/ga/,"0")
  line = line.gsub(/gc/,"0")
  line = line.gsub(/gg/,"0")
  line = line.gsub(/gt/,"0")
  line = line.gsub(/ta/,"0")
  line = line.gsub(/tc/,"0")
  line = line.gsub(/tg/,"0")
  line = line.gsub(/tt/,"0")
  print line
end