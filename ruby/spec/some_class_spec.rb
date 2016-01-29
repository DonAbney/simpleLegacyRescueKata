require_relative '../src/some_class'

describe SomeClass do
  describe '.someMethod' do

    context 'does stuff' do
      it 'returns stuff' do
        expect(SomeClass.someMethod).to eql(1)
      end
    end

  end
end
